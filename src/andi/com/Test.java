package andi.com;

public enum Test{

    NO_IOC(false),
    ACTIVE_IOC(true),
    CLEARED_IOC(false);

    private boolean boolValue;

    Test(final Boolean boolValue) { this.boolValue = boolValue ;}

    public Boolean getBoolValue() { return this.boolValue; }
    public Short getShortValue() { return (short)ordinal(); }

    public static Test getTest(final Boolean boolValue) {
        Test retrTest = null;

        for (final Test test : retrTest.values()) {
            final Boolean statusBool = test.getBoolValue();
            if ((boolValue == null && statusBool == null) || (boolValue.equals(statusBool))) {
                retrTest = test;
                break;
            }
        }
        return retrTest;
    }
}


/*
public enum Directions{
    EAST ("E"),
    WEST ("W"),
    NORTH ("N"),
    SOUTH ("S")
    ;
    */
/* Important Note: Must have semicolon at
     * the end when there is a enum field or method
     *//*

    private final String shortCode;

    Directions(String code) {
        this.shortCode = code;
    }

    public String getDirectionCode() {
        return this.shortCode;
    }
}*/
