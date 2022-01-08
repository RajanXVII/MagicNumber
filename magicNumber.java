class magicNumber{
public static void main(String[] args){
    int number=99999991;
    int total=0;
    do{
        total=getSumOfDigits(number);
        number=total;
        System.out.println("Inside do "+total);
    }while(total>9);
    if(total==1){
        System.out.println("Magic Number!!");
    }
    
}
private static int getSumOfDigits(int number){
        
    int num2=0;
    int total=0;
    while(number>0){
    num2=getRemainder(number);//3
    System.out.println("Remainder:"+num2);
    number=updateNumber(number,num2);
    total=total+num2;
    }
    return total;
    }
    private static int getRemainder(int number){
        return number%10;
    }
    
    private static int updateNumber(int number,int num2){
        return (number-num2)/10;
    }
}
