package cl.bennu.note.mapper.iface;

import cl.bennu.note.domain.Note;
import cl.bennu.note.mapper.iface.base.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface NoteMapper extends BaseMapper<Note> {
}
