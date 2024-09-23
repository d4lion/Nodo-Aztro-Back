package domains.travels;

import lombok.Data;

@Data
public class Provider {
    private String providerTransportName;
    private String providerName;
    private String providerId;

    public Provider(String Tranport, String CompanyName, String id) {
        this.providerTransportName = Tranport;
        this.providerName = CompanyName;
        this.providerId = id;
    }
}
