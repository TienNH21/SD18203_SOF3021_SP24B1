package fplhn.ptpm.sd18203.dto.mau_sac;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class StoreRequest {
    private int id;

    @NotBlank(message = "Không được để trống")
    private String ma;

    @NotBlank(message = "Không được để trống")
    private String ten;
}
