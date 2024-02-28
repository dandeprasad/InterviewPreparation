package AnyTest;


class Test {

    /*
     * Complete the 'minimumNumber' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. STRING password
     */

    public static int minimumNumber(int n, String password) {
        int count =0;
        if(!password.matches("(.*[a-z].*)")){
            count++;
        }
        if(!password.matches("(.*[[A-Z]].*)")){
            count++;
        }
        if(!password.matches("(.*[0-9].*)")){
            count++;
        }
        if(!password.matches("(.*[!@#$%^&*()-+ ].*)")){
            count++;
        }

        count = count + Integer.max(0, 6 - password.length() - count);
return  count;
    }

    public static void main(String [] args){

       System.out.println( minimumNumber(7,"AUzs-nV"));


    }
}
