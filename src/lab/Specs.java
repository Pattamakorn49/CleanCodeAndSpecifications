package lab;

/**
 * ==========================================================================
 *  ส่วน B — ฝึกเขียน Spec (JavaDoc) เอง
 * --------------------------------------------------------------------------
 *  โค้ดข้างล่างนี้ "ทำงานถูกต้องแล้ว" — ห้ามแก้ตัวโค้ด
 *  หน้าที่ของนิสิต: อ่านโค้ด แล้วเติม JavaDoc ให้แต่ละเมธอด
 *
 *  ต้องมีอย่างน้อย:
 *    - บรรทัดสรุปว่าเมธอด "ทำอะไร" (what, ไม่ใช่ how)
 *    - @param   ของทุกพารามิเตอร์ พร้อมข้อจำกัด (pre-condition)
 *    - @return  อธิบายค่าที่คืน (post-condition)
 *    - @throws  ทุก exception ที่โยน พร้อมเงื่อนไข
 * ==========================================================================
 */
public class Specs {

    // TODO ข้อ 4: เขียน JavaDoc ให้เมธอดนี้
    /**
     * หาข้อมูล key ที่ต้องการใน arr (โดย arr ต้องไม่เป็น null)
     * @param arr ข้อมูลที่รับเข้ามา ( ต้องไม่เป็น null )
     * @param key ข้อมูลที่ต้องการหา
     * @return จำนวนข้อมูลที่หาเจอ
     * @throws IllegalArgumentException ถ้า arr เป็น null
     */
    public static int firstIndexOf(int[] arr, int key) {
        if (arr == null) throw new IllegalArgumentException("arr must not be null");
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == key) return i;
        return -1;
    }

    // TODO ข้อ 5: เขียน JavaDoc ให้เมธอดนี้
    /**
     * สูตรหา circleArea โดยที่ radius มีค่า >= 0
     * @param radius รัศมี (ต้องมีค่า >= 0)
     * @return สูตรหาพื้นที่วงกลม
     * @throws IllegalArgumentException ถ้า radius มีค่าเป็น null
     */
    public static double circleArea(double radius) {
        if (radius < 0) throw new IllegalArgumentException("radius must be >= 0");
        return Math.PI * radius * radius;
    }

    // TODO ข้อ 6: เขียน JavaDoc ให้เมธอดนี้
    //   (เมธอดนี้ตัดช่องว่างหน้า-หลัง แล้วแปลงเป็นตัวพิมพ์เล็ก;
    //    input null ให้คืน string ว่าง)
    /**
     * แปลง s ที่รับเข้ามาตัดช่องว่างหน้า-หลัง แล้วแปลงเป็นตัวพิมพ์เล็กโดย s ต้องไม่เป็น null (ถ้าเป็นให้คืนstring ว่าง)
     * @param s ข้อมูลที่รับเข้ามา ( ต้องไม่เป็น null ถ้าเป็น null ให้คืน string ว่าง )
     * @return ข้อมูลที่มีการตัดช่องว่างหน้า-หลัง แล้วแปลงเป็นตัวพิมพ์เล็ก
     */
    public static String normalize(String s) {
        if (s == null) return "";
        return s.trim().toLowerCase();
    }
}
