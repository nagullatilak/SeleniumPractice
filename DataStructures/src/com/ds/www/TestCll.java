package com.ds.www;

public class TestCll {
    private ListNode last;
    private int length;
    private  class ListNode {
        private ListNode next;
        private int data;

        public ListNode(int data) {
            this.data = data;
        }
    }
        public TestCll(){
        last = null;
        length =0;
    }
    public int getLength(){
        return length;
    }
    public  boolean isEmpty(){
        return  length == 0;
    }
    public  void createCircularLinkedList() {
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);

        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = first;
    }
    public  static void main(String[] args){
        TestCll cll = new TestCll();
        cll.createCircularLinkedList();
    }
}
