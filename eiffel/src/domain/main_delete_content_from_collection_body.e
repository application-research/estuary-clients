note
 description:"[
		Estuary API
 		This is the API for the Estuary application.
  		OpenAPI spec version: 0.0.0
 	    

  	NOTE: This class is auto generated by the swagger code generator program.

 		 Do not edit the class manually.
 	]"
	date: "$Date$"
	revision: "$Revision$"
	EIS:"Eiffel swagger codegen", "src=https://github.com/swagger-api/swagger-codegen.git", "protocol=uri"
class MAIN_DELETE_CONTENT_FROM_COLLECTION_BODY 

inherit

  ANY
      redefine
          out 
      end


feature --Access

    by: detachable STRING_32 
      
    value: detachable STRING_32 
      

feature -- Change Element  
 
    set_by (a_name: like by)
        -- Set 'by' with 'a_name'.
      do
        by := a_name
      ensure
        by_set: by = a_name		
      end

    set_value (a_name: like value)
        -- Set 'value' with 'a_name'.
      do
        value := a_name
      ensure
        value_set: value = a_name		
      end


 feature -- Status Report

    out: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass MAIN_DELETE_CONTENT_FROM_COLLECTION_BODY%N")
        if attached by as l_by then
          Result.append ("%Nby:")
          Result.append (l_by.out)
          Result.append ("%N")    
        end  
        if attached value as l_value then
          Result.append ("%Nvalue:")
          Result.append (l_value.out)
          Result.append ("%N")    
        end  
      end
end


