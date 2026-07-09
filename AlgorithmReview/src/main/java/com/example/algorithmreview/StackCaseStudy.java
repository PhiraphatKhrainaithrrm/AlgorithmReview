package com.example.algorithmreview;

import java.util.Stack;

public class StackCaseStudy {
    public static void main(String[] args) {
        Stack<String> commands = new Stack<>();

        System.out.println("=== Stack Case Study ===");
        System.out.println("ระบบ Undo ในโปรแกรมจดบันทึก");

        // 1) เพิ่มคำสั่งทั้งหมดลงใน Stack
        commands.push("Type Data");
        commands.push("Type Structure");
        commands.push("Delete Structure");
        commands.push("Type Algorithm");
        commands.push("Type Java");

        // 2) แสดงคำสั่งทั้งหมดใน Stack
        System.out.println("\n1. คำสั่งทั้งหมดใน Stack:");
        for (String command : commands) {
            System.out.println("   " + command);
        }

        // 3) Undo คำสั่งล่าสุด 2 ครั้ง
        System.out.println("\n2. Undo คำสั่งล่าสุด 2 ครั้ง");

        String undone1 = null;
        String undone2 = null;

        // 6) ตรวจสอบก่อน pop() ว่า Stack ว่างหรือไม่
        if (!commands.isEmpty()) {
            undone1 = commands.pop();
        }

        if (!commands.isEmpty()) {
            undone2 = commands.pop();
        }

        // 4) แสดงคำสั่งที่ถูก Undo
        System.out.println("\n3. คำสั่งที่ถูก Undo:");
        if (undone1 != null) {
            System.out.println("   Undo ครั้งที่ 1: " + undone1);
        }
        if (undone2 != null) {
            System.out.println("   Undo ครั้งที่ 2: " + undone2);
        }

        // 5) แสดงสถานะของ Stack หลังจาก Undo
        System.out.println("\n4. สถานะของ Stack หลังจาก Undo:");
        if (commands.isEmpty()) {
            System.out.println("   Stack ว่าง");
        } else {
            for (String command : commands) {
                System.out.println("   " + command);
            }
        }

        // 7) อธิบายว่า Stack ใช้หลักการ LIFO อย่างไร
        System.out.println("\n5. การทำงานแบบ LIFO");
        System.out.println("   Stack ใช้หลักการ Last In, First Out");
        System.out.println("   หมายถึงข้อมูลที่ถูกเพิ่มเข้ามาล่าสุด จะถูกนำออกก่อน");
        System.out.println("   ในตัวอย่างนี้ 'Type Java' ถูก push เข้ามาล่าสุด จึงถูก undo ออกก่อน");

        // Time Complexity
        System.out.println("\n--- Time Complexity ---");
        System.out.println("push() และ pop() ของ Stack ใช้เวลา O(1) ต่อครั้ง");
        System.out.println("การแสดงข้อมูลทั้งหมดใน Stack ใช้เวลา O(n)");
    }
}