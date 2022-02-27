package com.truongjae.ltjavaweb.mapper;

import java.util.List;

public interface Mapper<S,D>{
    S to(D obj);
    D from(S obj);
    List<S> to(List<D> entities);
    List<D> from(List<S> dtos);
}
