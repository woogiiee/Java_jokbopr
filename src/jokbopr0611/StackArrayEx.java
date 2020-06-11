package jokbopr0611;

interface IStack{
   boolean isEmpty();
   boolean isFull();
   void push(int item); //���ÿ� �ֱ�
   int pop(); //���ÿ��� ������
   int peek();
   void clear();
}

class StackArray implements IStack {
   
   private int top;
   private int stackSize;
   private int stackArr[];
   
   public StackArray(int stackSize) {
      top=-1;      //���� ���ΰ� ����ִٸ� top=-1
      this.stackSize = stackSize;
      stackArr = new int[this.stackSize];
      
   }
   public boolean isEmpty(){ //������ ����ִ� �������� Ȯ��
      return top == -1;
   }
   public boolean isFull() { //������ ������ �������� Ȯ��
      return top == (this.stackSize-1);
   }
   public void push(int item) { //���ÿ� �����͸� �߰�
      if(isFull()) {
         System.out.println("Stack is full");
      }else {
         stackArr[++top] = item;
         System.out.println("Inserted Item : "+item);
      }      
   }   
   public int pop() { //������ �ֻ���(������) ������ ���� �� ����
      if(isEmpty()) {
         System.out.println("Pop fail! Stack is empty");
         return 0;
      }else {
         System.out.println("Deleted Item : "+stackArr[top]);
         return stackArr[--top];
      }
   }
   public int peek() { //�ֻ��� ������ ����
      if(isEmpty()) {
         System.out.println("peak fail! Stack is empty!");
         return 0;
      }else {
         System.out.println("Peeked Item : "+stackArr[top]);
         return stackArr[top];
      }
   }
   public void clear() { //���� �ʱ�ȭ
      if(isEmpty()) {
         System.out.println("Stack is already empty");
      }else {
         top = -1;
         stackArr = new int[this.stackSize];
         System.out.println("Stack is clear");         
      }
   }
   public void printStack() {
          if(isEmpty()) {
             System.out.println("I can't print! stack is empty");
          }else {
             System.out.print("stack elements : ");
             for(int i=0;i<=top;i++) {
                System.out.println(stackArr[i]+" ");
             }
             System.out.println();
          }
       }
}

public class StackArrayEx{
   public static void main(String[] args) {
      StackArray isk = new StackArray(5);
      
      isk.push(10);
      isk.printStack();
      isk.push(5);
      isk.printStack();
      isk.push(2);
      isk.printStack();
      
       isk.pop();
       isk.printStack();
       isk.pop();
       isk.printStack();

       
       isk.peek();
       isk.printStack();
       
         
       isk.clear();
       isk.printStack();

   }
}