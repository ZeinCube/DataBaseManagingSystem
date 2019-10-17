package executables

interface Executable<T>
{
    fun execute(i:Any?):T;
}