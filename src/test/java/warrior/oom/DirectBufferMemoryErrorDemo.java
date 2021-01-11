package warrior.oom;	
import java.nio.ByteBuffer;


public class DirectBufferMemoryErrorDemo {

	public static void main(String[] args) {
		
		System.out.println(sun.misc.VM.maxDirectMemory()/1024/1024);
		ByteBuffer bb = ByteBuffer.allocateDirect(6*1024*1024);
	}

}

