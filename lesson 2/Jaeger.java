public class Jaeger {
    private String modelName;

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getModelName() {
        return modelName;
    }

    private String mark;

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getMark() {
        return mark;
    }

    private String origin;

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getOrigin() {
        return origin;
    }

    public void drift() {
        System.out.println("Neural bridge created");
    }

    public void attack() {
        System.out.println("Kaiju is under attack");
    }
}