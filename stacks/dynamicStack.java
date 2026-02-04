package stacks;

public class dynamicStack extends customStack {
    public dynamicStack(){
        super(); //it will call customStack()
    } 
    public dynamicStack(int size){
        super(size); //it will call customStack(int size)
    }

    @Override
    public boolean push(int item){
        if(this.isFull()){
            // double the array size
            int[] temp = new int[data.length * 2];

            // copy all previous items in new data 
            for(int i = 0; i < data.length; i++){
                temp[i] = data[i];
            }

            data = temp;
        }

        //at this point we know that array is not full
        //insert item
        return super.push(item);
    }
    public static void main(String[] args) throws Exception {
        dynamicStack stack = new dynamicStack(5);

        stack.push(34);
        stack.push(45);
        stack.push(2);
        stack.push(9);
        stack.push(18);
        stack.push(100); // This will trigger dynamic resizing

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
