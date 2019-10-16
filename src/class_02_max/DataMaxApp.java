package class_02_max;

class DataMaxApp {
    public static void main(String[] args) {
        useCommon();
        //useApi();
    }

    private static void useCommon() {
        int num1 =2;
        int num2 = 0;
        System.out.println(num1+"、"+num2+"中最大值是："+ Common.max(num1, num2));

        float num3 =2.0f;
        float num4 = 5.0f;
        System.out.println(num3+"、"+num4+"中最大值是："+ Common.max(num3, num4));

        int num5 =2;
        int num6 = 0;
        int num7 = 5;
        System.out.println(num5+"、"+num6+"、"+num7+"中最大值是："+ Common.max(num5, num6, num7));
    }

    private static void useApi() {
        int num1 =2;
        int num2 = 0;
        System.out.println(num1+"、"+num2+"中最大值是："+ Math.max(num1, num2));

        float num3 =2.0f;
        float num4 = 5.0f;
        System.out.println(num3+"、"+num4+"中最大值是："+ Math.max(num3, num4));

        int num5 =2;
        int num6 = 0;
        int num7 = 5;
        System.out.println(num5+"、"+num6+"、"+num7+"中最大值是："+ Common.max(num5, num6, num7));
    }
}
