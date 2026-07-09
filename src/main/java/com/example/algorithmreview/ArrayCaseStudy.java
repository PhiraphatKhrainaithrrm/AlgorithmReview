package com.example.algorithmreview;

public class ArrayCaseStudy {
    public static void main(String[] args) {
        int[] scores = {6, 8, 4, 9, 7, 5, 10, 3, 8, 2};

        int sum = 0;
        int max = scores[0];
        int min = scores[0];
        int countPass7 = 0;

        System.out.println("=== Array Case Study ===");
        System.out.println("ระบบวิเคราะห์คะแนนสอบก่อนเรียนของนักศึกษา");

        // แสดงคะแนนนักศึกษาแต่ละคน
        for (int i = 0; i < scores.length; i++) {
            System.out.println("Student " + (i + 1) + " : " + scores[i] + " คะแนน");
        }

        // คำนวณข้อมูลต่าง ๆ
        for (int score : scores) {
            sum += score;

            if (score > max) {
                max = score;
            }

            if (score < min) {
                min = score;
            }

            if (score >= 7) {
                countPass7++;
            }
        }

        double average = (double) sum / scores.length;

        System.out.println("\n--- ผลการวิเคราะห์ ---");
        System.out.println("1. คะแนนรวมของนักศึกษาทั้งหมด = " + sum);
        System.out.printf("2. คะแนนเฉลี่ย = %.2f%n", average);
        System.out.println("3. คะแนนสูงสุด = " + max);
        System.out.println("4. คะแนนต่ำสุด = " + min);
        System.out.println("5. จำนวนนักศึกษาที่ได้คะแนนตั้งแต่ 7 คะแนนขึ้นไป = " + countPass7);

        System.out.println("6. รายชื่อนักศึกษาที่ควรได้รับการทบทวนเพิ่ม (คะแนนต่ำกว่า 5)");
        boolean found = false;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] < 5) {
                System.out.println("   Student " + (i + 1) + " ได้ " + scores[i] + " คะแนน");
                found = true;
            }
        }

        if (!found) {
            System.out.println("   ไม่มีนักศึกษาที่ได้คะแนนต่ำกว่า 5");
        }

        // อธิบาย Time Complexity
        System.out.println("\n--- Time Complexity ---");
        System.out.println("การวนลูปผ่าน Array เพื่อหาผลรวม ค่าเฉลี่ย ค่าสูงสุด ค่าต่ำสุด และนับจำนวน ใช้เวลา O(n)");
    }
}
