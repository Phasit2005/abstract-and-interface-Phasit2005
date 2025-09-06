public abstract class LogisticsService {
    String serviceName;

    public LogisticsService(String serviceName){
        this.serviceName = serviceName;
    }

    abstract String getServiceType();
}
