class Solution {
    static Long[] lcmAndGcd(Long A , Long B) {
        Long Gcd=1L;
        Long a=A;
        Long b=B;
        while(a%b !=0){
            Long rem=a%b;
            a=b;
            b=rem;
        }
        Gcd=b;
        Long lcm=(A*B)/Gcd;
        Long []arr={lcm,Gcd};
        return arr;
    }
};
