package gold.jenkins;

class Output {

    static def hello(String name) {
        echo(Hello ${name});
    }
}