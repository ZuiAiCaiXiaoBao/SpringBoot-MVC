package com.sso.server.util;


import com.sso.server.vo.ClientInfoVo;

import java.util.*;

/**
 * Created by wolfcode-lanxw
 */
public class MockDatabaseUtil {
    public static Set<String> T_TOKEN = new HashSet<String>();
    public static Map<String,List<ClientInfoVo>> T_CLIENT_INFO =new HashMap<String,List<ClientInfoVo>>();
}
