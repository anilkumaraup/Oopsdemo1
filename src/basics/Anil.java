package basics;
class Anil{
	public int[] phoneusage(int[] input1, int input2){
		TypeOfCall local = new Local(input1[0]);
		TypeOfCall std = new STD (input1[1]);
		TypeOfCall isd = new ISD(input1[2]);
		double totalAmount=0;
		totalAmount=local.amountused ()+std. amountused ()+isd.amountused();
		int[] arr = new int [2];


		if (totalAmount >input2) {
			arr[0]=1;
			arr[1]=(int) totalAmount-input2;
		}
		else {
			arr[0]=0;
			arr[1]=(int) totalAmount;
		}
return arr;
}}