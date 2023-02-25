import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(as = Location.class)
public class Location {
    @JsonProperty("Ref")
    public String ref;
    @JsonProperty("SettlementType")
    public String settlementType;
    @JsonProperty("Latitude")
    public String latitude;
    @JsonProperty("Longitude")
    public String longitude;
    @JsonProperty("Description")
    public String description;
    @JsonProperty("DescriptionRu")
    public String descriptionRu;
    @JsonProperty("DescriptionTranslit")
    public String descriptionTranslit;
    @JsonProperty("SettlementTypeDescription")
    public String settlementTypeDescription;
    @JsonProperty("SettlementTypeDescriptionRu")
    public String settlementTypeDescriptionRu;
    @JsonProperty("SettlementTypeDescriptionTranslit")
    public String settlementTypeDescriptionTranslit;
    @JsonProperty("Region")
    public String region;
    @JsonProperty("RegionsDescription")
    public String regionsDescription;
    @JsonProperty("RegionsDescriptionRu")
    public String regionsDescriptionRu;
    @JsonProperty("RegionsDescriptionTranslit")
    public String regionsDescriptionTranslit;
    @JsonProperty("Area")
    public String area;
    @JsonProperty("AreaDescription")
    public String areaDescription;
    @JsonProperty("AreaDescriptionRu")
    public String areaDescriptionRu;
    @JsonProperty("AreaDescriptionTranslit")
    public String areaDescriptionTranslit;
    @JsonProperty("Index1")
    public String index1;
    @JsonProperty("Index2")
    public String index2;
    @JsonProperty("IndexCOATSU1")
    public String indexCOATSU1;
    @JsonProperty("Delivery1")
    public String delivery1;
    @JsonProperty("Delivery2")
    public String delivery2;
    @JsonProperty("Delivery3")
    public String delivery3;
    @JsonProperty("Delivery4")
    public String delivery4;
    @JsonProperty("Delivery5")
    public String delivery5;
    @JsonProperty("Delivery6")
    public String delivery6;
    @JsonProperty("Delivery7")
    public String delivery7;
    @JsonProperty("SpecialCashCheck")
    public int specialCashCheck;
    @JsonProperty("Warehouse")
    public String warehouse;

    @JsonCreator
    public Location(@JsonProperty("Ref") String ref, @JsonProperty("SettlementType") String settlementType, @JsonProperty("Latitude") String latitude, @JsonProperty("Longitude") String longitude, @JsonProperty("Description") String description, @JsonProperty("DescriptionRu") String descriptionRu,
                    @JsonProperty("DescriptionTranslit") String descriptionTranslit, @JsonProperty("SettlementTypeDescription") String settlementTypeDescription, @JsonProperty("SettlementTypeDescriptionTranslit") String settlementTypeDescriptionRu,
                    @JsonProperty("SettlementTypeDescriptionTranslit") String settlementTypeDescriptionTranslit, @JsonProperty("Region") String region, @JsonProperty("RegionsDescription") String regionsDescription, @JsonProperty("RegionsDescriptionRu") String regionsDescriptionRu,
                    @JsonProperty("RegionsDescriptionTranslit") String regionsDescriptionTranslit, @JsonProperty("Area")String area, @JsonProperty("AreaDescription")String areaDescription, @JsonProperty("AreaDescriptionRu") String areaDescriptionRu,
                    @JsonProperty("AreaDescriptionTranslit") String areaDescriptionTranslit, @JsonProperty("Index1") String index1, @JsonProperty("Index2") String index2, @JsonProperty("IndexCOATSU1") String indexCOATSU1,@JsonProperty("Delivery1") String delivery1,
                    @JsonProperty("Delivery2") String delivery2, @JsonProperty("Delivery3") String delivery3, @JsonProperty("Delivery4")String delivery4, @JsonProperty("Delivery5")String delivery5, @JsonProperty("Delivery6")String delivery6, @JsonProperty("Delivery7")String delivery7,
                    @JsonProperty("SpecialCashCheck") int specialCashCheck, @JsonProperty("Warehouse") String warehouse) {
        this.ref = ref;
        this.settlementType = settlementType;
        this.latitude = latitude;
        this.longitude = longitude;
        this.description = description;
        this.descriptionRu = descriptionRu;
        this.descriptionTranslit = descriptionTranslit;
        this.settlementTypeDescription = settlementTypeDescription;
        this.settlementTypeDescriptionRu = settlementTypeDescriptionRu;
        this.settlementTypeDescriptionTranslit = settlementTypeDescriptionTranslit;
        this.region = region;
        this.regionsDescription = regionsDescription;
        this.regionsDescriptionRu = regionsDescriptionRu;
        this.regionsDescriptionTranslit = regionsDescriptionTranslit;
        this.area = area;
        this.areaDescription = areaDescription;
        this.areaDescriptionRu = areaDescriptionRu;
        this.areaDescriptionTranslit = areaDescriptionTranslit;
        this.index1 = index1;
        this.index2 = index2;
        this.indexCOATSU1 = indexCOATSU1;
        this.delivery1 = delivery1;
        this.delivery2 = delivery2;
        this.delivery3 = delivery3;
        this.delivery4 = delivery4;
        this.delivery5 = delivery5;
        this.delivery6 = delivery6;
        this.delivery7 = delivery7;
        this.specialCashCheck = specialCashCheck;
        this.warehouse = warehouse;
    }
}


