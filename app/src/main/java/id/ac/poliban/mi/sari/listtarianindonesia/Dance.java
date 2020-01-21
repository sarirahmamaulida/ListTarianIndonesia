package id.ac.poliban.mi.sari.listtarianindonesia;

public class Dance {
    private String flag;
    private String danceName;
    private String danceDesc;

    public Dance(String flag, String danceName, String danceDesc) {
        this.flag = flag;
        this.danceName = danceName;
        this.danceDesc = danceDesc;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getDanceName() {
        return danceName;
    }

    public void setDanceName(String danceName) {
        this.danceName = danceName;
    }

    public String getDanceDesc() {
        return danceDesc;
    }

    public void setDanceDesc(String danceDesc) {
        this.danceDesc = danceDesc;
    }

    @Override
    public String toString() {
        return String.format("%30s", getDanceName());
    }
}
