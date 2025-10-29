class Solution {
    public int smallestNumber(int n) {
        String binaryNumber = Integer.toBinaryString(n);
        String convertAllOne = binaryNumber.replace('0','1');
        int num = Integer.parseInt(convertAllOne,2);
        return num;
    }
}