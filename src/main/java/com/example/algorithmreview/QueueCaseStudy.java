package com.example.algorithmreview;

import java.util.LinkedList;
import java.util.Queue;

public class QueueCaseStudy {
    public static void main(String[] args) {
        Queue<String> patients = new LinkedList<>();

        System.out.println("=== Queue Case Study ===");
        System.out.println("ระบบคิวผู้ป่วยในคลินิกสุขภาพ");

        // 1) เพิ่มผู้ป่วย P001 ถึง P005 ลงใน Queue
        patients.add("P001");
        patients.add("P002");
        patients.add("P003");
        patients.add("P004");
        patients.add("P005");

        System.out.println("\n1. รายชื่อผู้ป่วยเริ่มต้นในคิว:");
        System.out.println("   " + patients);

        // 2) เรียกผู้ป่วยออกจากคิว 2 คน
        System.out.println("\n2. เรียกผู้ป่วยออกจากคิว 2 คน");
        String served1 = null;
        String served2 = null;

        // 7) ตรวจสอบก่อน remove() ว่า Queue ว่างหรือไม่
        if (!patients.isEmpty()) {
            served1 = patients.remove();
        }

        if (!patients.isEmpty()) {
            served2 = patients.remove();
        }

        System.out.println("   ผู้ป่วยที่ได้รับบริการแล้ว: " + served1);
        System.out.println("   ผู้ป่วยที่ได้รับบริการแล้ว: " + served2);

        // 3) เพิ่มผู้ป่วย P006 และ P007 เข้า Queue
        patients.add("P006");
        patients.add("P007");

        // 4) แสดงผู้ป่วยคนถัดไปด้วย peek()
        System.out.println("\n3. ผู้ป่วยคนถัดไปคือ: " + patients.peek());

        // 5) แสดงจำนวนผู้ป่วยที่ยังรออยู่ด้วย size()
        System.out.println("4. จำนวนผู้ป่วยที่ยังรออยู่: " + patients.size() + " คน");

        // 6) แสดงสถานะของ Queue หลังจากดำเนินการทั้งหมด
        System.out.println("\n5. สถานะของ Queue หลังจากดำเนินการทั้งหมด:");
        System.out.println("   " + patients);

        // 8) อธิบายว่า Queue ใช้หลักการ FIFO อย่างไร
        System.out.println("\n6. การทำงานแบบ FIFO");
        System.out.println("   Queue ใช้หลักการ First In, First Out");
        System.out.println("   หมายถึงข้อมูลที่เข้ามาก่อน จะถูกนำออกก่อน");
        System.out.println("   ในตัวอย่างนี้ P001 และ P002 เข้าคิวก่อน จึงได้รับบริการก่อน");

        // Time Complexity
        System.out.println("\n--- Time Complexity ---");
        System.out.println("add(), remove(), peek() ของ Queue ใช้เวลา O(1) โดยเฉลี่ย");
        System.out.println("การแสดงข้อมูลทั้งหมดใน Queue ใช้เวลา O(n)");
    }
}
