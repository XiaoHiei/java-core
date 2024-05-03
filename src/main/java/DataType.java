public class DataType {
    public static void main(String[] args) {
        // sout = System.out.println("text");
        System.out.println("Tieu Tuyet");
        // Cú pháp khởi tạo biến
        // [kieu_du_lieu] [ten_bien] = [gia_tri_khoi_tao];

        // kiểu số nguyên: byte(1), short(2),int(4),long(8)
        int age = 18;
        System.out.println("age = " + age);

        // kiểu số thực: float (4), double (8)
        float pi = 3.141592653589793f;
        double PI = 3.141592653589793;
        System.out.println("pi = " + pi);
        System.out.println("PI = " + PI);
        // "bien".sout = System.out.println("text cung" + bien);

        // Kiểu logic: boolean
        boolean isLoading = true;
        System.out.println("isLoading = " + isLoading);

        // Kiểu kí tự: char (2)
        char c = 'a';
        System.out.println("c = " + c);

        // Kiểu xâu kí tự: String -- auto viết hoa S
        String name = "XiaoXue";
        System.out.println("name = " + name);

        // Kiểu enum
        Gender gender = Gender.Male;
        System.out.println("Gender = " + gender);


        // Class & Object
        Cosplay cosplay1 = new Cosplay();
        cosplay1.name = "XiaoXue";
        cosplay1.age = 27;
        cosplay1.gender = Gender.Female;
        cosplay1.talk();
        int sum = cosplay1.sum(1, 10);
        System.out.println("sum " + sum);


    }
}
