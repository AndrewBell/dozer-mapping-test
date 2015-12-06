/**
 * Created by Andrew Bell 12/5/2015
 * www.recursivechaos.com
 * andrew@recursivechaos.com
 * Licensed under MIT License 2015. See license.txt for details.
 */

package com.recursivechaos.mappingtest.mapper;

import com.recursivechaos.mappingtest.domain.DestObj;
import com.recursivechaos.mappingtest.domain.SourceObj;
import org.dozer.DozerBeanMapper;

import java.util.ArrayList;
import java.util.List;

public class ObjMapper {


    public DestObj mapObj(SourceObj source) {
        DozerBeanMapper mapper = new DozerBeanMapper();

        // Add mapping file
        List<String> myMappingFiles = new ArrayList<String>();
        myMappingFiles.add("dozer/dozer.xml");
        mapper.setMappingFiles(myMappingFiles);

        // map
        return mapper.map(source, DestObj.class);
    }

}
