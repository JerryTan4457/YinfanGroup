package com.yfkj.datacenter.biz.manager.helper;

import com.yfkj.datacenter.api.exception.ExceptionCode;
import com.yfkj.datacenter.api.exception.ServiceException;
import org.apache.commons.beanutils.BeanUtils;

import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Jerry Tan
 * @date 2017\12\26 0026 17:10
 */
public abstract class ModelHelper<DO, DTO> {
    private Class<DO> doClass = (Class<DO>) ((ParameterizedType)this.getClass().getGenericSuperclass()).getActualTypeArguments()[0];
    private Class<DO> dtoClass = (Class<DO>) ((ParameterizedType)this.getClass().getGenericSuperclass()).getActualTypeArguments()[1];

    public DO convertToDO(DTO modelDTO){
        if (modelDTO == null){
            return null;
        }
        try{
            DO data = (DO) doClass.newInstance();
            BeanUtils.copyProperties(data,modelDTO);
            return data;
        }catch (Throwable th){
            throw new ServiceException(ExceptionCode.CONVERT_ERROR.getErrorCode(),"convert error",th);
        }
    }

    public DTO convertToDTO(DO modelDO){
        if (modelDO == null){
            return null;
        }
        try{
            DTO data = (DTO) dtoClass.newInstance();
            BeanUtils.copyProperties(data,modelDO);
            return data;
        }catch (Throwable th){
            throw new ServiceException(ExceptionCode.CONVERT_ERROR.getErrorCode(),"convert error",th);
        }
    }

    public List<DO> convertToDO(List<DTO> modelDTOs){
        List<DO> doList = new ArrayList<DO>();
        for (DTO modelDTO : modelDTOs){
            doList.add(convertToDO(modelDTO));
        }
        return doList;
    }

    public List<DTO> convertToDTO(List<DO> modelDOs) {
        List<DTO> doList = new ArrayList<DTO>();
        for (DO modelDO : modelDOs){
            doList.add(convertToDTO(modelDO));
        }
        return doList;
    }
}
