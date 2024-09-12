package cl.bennu.note.mapper.iface;

import org.apache.ibatis.annotations.Mapper;

import cl.bennu.note.domain.Profile;
import cl.bennu.note.mapper.iface.base.BaseMapper;

@Mapper
public interface ProfileMapper extends BaseMapper<Profile>{
    
}