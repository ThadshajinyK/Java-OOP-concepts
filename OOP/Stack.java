package OOP;

public class Stack {
   private int[] s =new int[10];
    private int tos;
    //pop to get the number
    //push to insert the number in the stack

    Stack(){
        tos = -1; //top of stack
    }

    public void push(int item) {
        if(tos==this.s.length) {
            System.out.println("Stack is full");
        }
        /*tos=tos+1;
        s[tos] = item;
*/
        // in one line we can give the above code as below
        else {
            s[++tos] = item; // pre increment -1+1=0
        }
    }

    public int pop(){
        if(tos>=0){
            return s[tos--]; // kadasisi elementa anupitu antha tos a kuraikonum
        }
        else {
            System.out.println("stack is empty");
            return -1;
        }
    }

}
