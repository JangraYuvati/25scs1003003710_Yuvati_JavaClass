class Maximum {
int max(int a, int b) {
        if(a>b){
            return a;
        }
    else return b;
    }

  
int max(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    
    double max(double a, double b) {
       if(a>b){
            return a;
        }
    else return b;
    }

    public static void main(String[] args) {

        Maximum m = new Maximum();

        System.out.println("Maximum of two integers: " + m.max(10, 20));

        System.out.println("Maximum of three integers: " + m.max(10, 25, 15));

        System.out.println("Maximum of two decimal numbers: " + m.max(12.5, 10.8));
    }
}