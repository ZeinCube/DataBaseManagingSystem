
fun MySQLRealEscapeString(str:String):String
{
    if (str.replace("[a-zA-Z0-9_!@#$%^&*()-=+~.;:,\\Q[\\E\\Q]\\E<>{}\\/? ]", "").isEmpty()) {
        return str
    }

    var clean_string = str
    clean_string = clean_string.replace("\\", "\\\\")
    clean_string = clean_string.replace("\n", "\\n")
    clean_string = clean_string.replace("\b", "\\b")
    clean_string = clean_string.replace("\r", "\\r")
    clean_string = clean_string.replace("\t", "\\t")
    clean_string = clean_string.replace("'", "\\'")
    clean_string = clean_string.replace("\"", "\\\"")

    if (clean_string.replace("[a-zA-Z0-9_!@#$%^&*()-=+~.;:,\\Q[\\E\\Q]\\E<>{}/?\\\\\"' ]".toRegex(), "").isEmpty()) {
        return clean_string
    }
    throw Throwable("WTF")
}
fun MySQLRealGetString(str:String):String
{

    var clean_string = str
    clean_string = clean_string.replace("\\\\","\\*")
    clean_string = clean_string.replace("\\n","\n" )
    clean_string = clean_string.replace("\\b","\b" )
    clean_string = clean_string.replace("\\r","\r" )
    clean_string = clean_string.replace("\\t","\t" )
    clean_string = clean_string.replace("\\'", "'")
    clean_string = clean_string.replace("\\\"", "\"")
    clean_string = clean_string.replace("\\*","\\")
    return clean_string
}