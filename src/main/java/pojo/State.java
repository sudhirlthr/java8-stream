package pojo;

public class State {
    private String stateCode;

    public String getCapitalName() {
        return capitalName;
    }

    public void setCapitalName(String capitalName) {
        this.capitalName = capitalName;
    }

    private String capitalName;
    public State(String stateCode, String capitalName){
        this.stateCode = stateCode;
        this.capitalName = capitalName;
    }

    public String getStateCode() {
        return stateCode;
    }

    public void setStateCode(String stateCode) {
        this.stateCode = stateCode;
    }
}
