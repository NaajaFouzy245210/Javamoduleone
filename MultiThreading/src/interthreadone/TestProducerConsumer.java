package interthreadone;

public class TestProducerConsumer {

		public static void main(String[] args) {

			DataBuffer sharedObject = new DataBuffer();
			producerInteger producer = new producerInteger(sharedObject);
			ConsumerInteger consumer = new ConsumerInteger(sharedObject);
			
			producer.start();
			consumer.start();
			
		}

	}

