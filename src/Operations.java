public class Operations {
    public int checkOparation(int prev , int past , char operator ){
        if(operator == '+'){
            return sum(past , prev);
        }else if(operator == '-'){
            return min(prev , past);
        }else if(operator == 'X'){
            return mul(past , prev);
        }else if(operator == '/'){
            return div(past , prev);
        }else{
            return 463;
        }
    }
    int sum(int a , int b){
        return a + b;
    }
    int min(int a , int b){
        return a - b;
    }
    int div(int a , int b){
        return a / b;
    }
    int mul(int a , int b){
        return a * b;
    }
}
