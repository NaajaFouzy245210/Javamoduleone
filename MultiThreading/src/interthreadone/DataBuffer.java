package interthreadone;

public class DataBuffer {
//public class DataBuffer {
	public static void main(String[] args) {
		
	}
		

		private int sharedInt = -1;
		public void setSharedInt(int value) {
			
			System.err.println(Thread.currentThread().getName()+ "setting sharedBuffer to" + value);
			sharedInt = value;
		}
		
		public int getSharedInt() {
			
			System.err.println(Thread.currentThread().getName() + "retrieving sharedBuffer value "+ sharedInt);
			return sharedInt;
		}

	}



