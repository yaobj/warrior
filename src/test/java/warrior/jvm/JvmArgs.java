package warrior.jvm;

public class JvmArgs {

	
	// jps -l  （查看java进程）
	// jinfo 进程号（ 查看java进程的详细信息）
	// jinfo -flag 参数名称 进程号 （查询具体参数的信息）
	// jinfo -flags 进程号 （查看java进程的jvm参数）
	
	// java -XX:+PrintFlagsInitial （查看jvm参数的初始值）
	// java -XX:+PrintFlagsFinal （查看jvm参数的最终值，即修改后的值）
	// java -XX:+PrintFlagsFinal -XX:MetaspaceSize=512m java程序 （查看并修改参数）
	// java -XX:+PrintCommandLineFlags -version （查看jvm使用的默认参数）
	// -Xms10m == -XX:InitialHeapSize=10m （设置堆内存的初始值）
	// -Xmx10m == -XX:MaxHeapSize=10m （设置堆内存的最大值）
	// -Xss512k == -XX:ThreadStackSize=512k （设置单个线程的栈空间大小）
	// -XX:MetaspaceSize=1024m （设置元空间的大小）
	// -XX:+PrintGCDetails （开启打印GC详细信息）
	// -XX:SurvivorRatio=N （说明新生代中eden和survivor1和survivor2的内存大小比例N:1:1）
	// -XX:NewRatio=N（设置新生代和老年代的内存大小比例为1:N*1.2）
	// -XX:MaxTenuringThreshold=N （设置对象在新生代最大可经历N次GC（survivor区）进入老年代，设置为0新生代对象不经历survivor区，可增加对象在新生代被回收的概率）
	
	// -XX:+UseSerialGC

}

