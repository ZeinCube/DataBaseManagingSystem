package controller;

public class TestResult {
    private String name;
    private String result;

    public TestResult(String name, String result) {
        this.name = name;
        this.result = result;
    }

    public String getName() {
        return name;
    }

    public String getResult() {
        return result;
    }
}
