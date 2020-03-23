package model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProdusCofetarie {
    private String numeProdusCofetarie;

    private double pretProdusCofetarie;

    private double gramajProdusCofetarie;

}
