package di;

public class worker {
	worker worker;
	public void setworker(worker w)
	{
		worker = w;
		
	}
	public void manage()
	{
		worker.work();
		
	}
	private void work() {
		
	}
	class superworker{
		public void work() {
			
		}
	}

}
