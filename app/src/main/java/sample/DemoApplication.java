package sample;

import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(DemoApplication.class);
        app.setBannerMode(Banner.Mode.OFF); // バナーを出力しない
        app.run(args);
    }

    @Override
    public void run(String... args) {
        System.out.println("Hello, World! from AWS Batch");
        System.exit(0); // ← Batchジョブ即時終了
    }
}
