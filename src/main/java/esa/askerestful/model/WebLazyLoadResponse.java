package esa.askerestful.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class WebLazyLoadResponse<T>{

    private T data;

    private String errors;

    private LazyLoadResponse paging;
}