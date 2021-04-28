package tr.tubitak.gov.tr.elevationservice.model;

public class ReturnOfElModel {
    private int height;

    public ReturnOfElModel(int height) {
        this.height = height;
    }

    public ReturnOfElModel() {
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
