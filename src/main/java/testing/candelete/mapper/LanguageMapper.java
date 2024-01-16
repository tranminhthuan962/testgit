package testing.candelete.mapper;

import org.apache.ibatis.annotations.Mapper;
import testing.candelete.model.Language;

import java.util.List;

@Mapper
public interface LanguageMapper {
//    @Select("select * from sakila.language ")
//    List<Language> findAll();

    //    @Insert("insert into sakila.language (name) value(#{name})")
//    @SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "language_id",
//            before = false, resultType = Integer.class)
//    void insert(Language language);
//    String insert(Language language);
//
//    int deleteById(Language language);
//
    List<Language> findAll();
    List<Language> selectByName(String langName);
}
