package gasyz.api;

import gasyz.common.Code;
import gasyz.common.CommonResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by gaoang on 2018/2/26.
 */
@Controller
@RequestMapping("/spittles")
public class SpittleController {

    @RequestMapping(value = "/get",method = RequestMethod.GET)
    public Object spilltes(long max,int cout) {
     return new CommonResponse(Code.SUCCESS,"测试",max);
    }

}
