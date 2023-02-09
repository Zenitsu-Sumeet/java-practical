class rangesum{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=sc.nextInt();
        int sum;
            for(int j=n;j<=a;j++){
                sum+=j;
            }
           System.out.println(sum);
        }
   
}