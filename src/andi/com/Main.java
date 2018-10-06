package andi.com;

class EnumDemo
{
    public static void main(String[] args) {

        Test test = Test.CLEARED_IOC;
        System.out.println(test.getShortValue());

        System.out.println(test.getTest(true));

        /*Directions dir = Directions.SOUTH;
        System.out.println(dir.getDirectionCode());
        Directions dir2 = Directions.EAST;
        System.out.println(dir2.getDirectionCode());*/
    }
}