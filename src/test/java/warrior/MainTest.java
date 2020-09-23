package warrior;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.logging.Logger;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import warrior.bean.HelloWorld;

public class MainTest {

	private static ApplicationContext applicationContext;

	public static void main(String[] args) {

		applicationContext = new ClassPathXmlApplicationContext("spring-applicationContext.xml");
		HelloWorld helloWorld = applicationContext.getBean(HelloWorld.class);
		helloWorld.hello("孙悟空");
		DataSource dataSource = new DataSource() {

			public PrintWriter getLogWriter() throws SQLException {

				// TODO 补充自动生成的代码块
				return null;
			}

			public void setLogWriter(PrintWriter out) throws SQLException {

				// TODO 补充自动生成的代码块

			}

			public void setLoginTimeout(int seconds) throws SQLException {

				// TODO 补充自动生成的代码块

			}

			public int getLoginTimeout() throws SQLException {

				// TODO 补充自动生成的代码块
				return 0;
			}

			public Logger getParentLogger() throws SQLFeatureNotSupportedException {

				// TODO 补充自动生成的代码块
				return null;
			}

			public <T> T unwrap(Class<T> iface) throws SQLException {

				// TODO 补充自动生成的代码块
				return null;
			}

			public boolean isWrapperFor(Class<?> iface) throws SQLException {

				// TODO 补充自动生成的代码块
				return false;
			}

			public Connection getConnection() throws SQLException {

				// TODO 补充自动生成的代码块
				return null;
			}

			public Connection getConnection(String username, String password) throws SQLException {

				// TODO 补充自动生成的代码块
				return null;
			}

		};
	}

}
