package guru.springframework.sfgjms.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class HelloWorldMessage implements Serializable {

//    Setting serialVsUID is also a good practice for messages. Here it was not required
    private static final long serialVersionUID = -4559326306180633707L;

    private UUID uuid;
    private String message;
}
