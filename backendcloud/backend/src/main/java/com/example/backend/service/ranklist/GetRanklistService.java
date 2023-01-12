package com.example.backend.service.ranklist;

import com.alibaba.fastjson.JSONObject;

public interface GetRanklistService {
    JSONObject getList(Integer page);
}

