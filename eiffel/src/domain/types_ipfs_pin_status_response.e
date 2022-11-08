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
class TYPES_IPFS_PIN_STATUS_RESPONSE 

inherit

  ANY
      redefine
          out 
      end


feature --Access

    created: detachable STRING_32 
      
    delegates: detachable LIST [STRING_32] 
      
    info: detachable ANY 
      
    pin: detachable TYPES_IPFS_PIN 
      
    requestid: detachable STRING_32 
      
    status: detachable STRING_32 
      

feature -- Change Element  
 
    set_created (a_name: like created)
        -- Set 'created' with 'a_name'.
      do
        created := a_name
      ensure
        created_set: created = a_name		
      end

    set_delegates (a_name: like delegates)
        -- Set 'delegates' with 'a_name'.
      do
        delegates := a_name
      ensure
        delegates_set: delegates = a_name		
      end

    set_info (a_name: like info)
        -- Set 'info' with 'a_name'.
      do
        info := a_name
      ensure
        info_set: info = a_name		
      end

    set_pin (a_name: like pin)
        -- Set 'pin' with 'a_name'.
      do
        pin := a_name
      ensure
        pin_set: pin = a_name		
      end

    set_requestid (a_name: like requestid)
        -- Set 'requestid' with 'a_name'.
      do
        requestid := a_name
      ensure
        requestid_set: requestid = a_name		
      end

    set_status (a_name: like status)
        -- Set 'status' with 'a_name'.
      do
        status := a_name
      ensure
        status_set: status = a_name		
      end


 feature -- Status Report

    out: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass TYPES_IPFS_PIN_STATUS_RESPONSE%N")
        if attached created as l_created then
          Result.append ("%Ncreated:")
          Result.append (l_created.out)
          Result.append ("%N")    
        end  
        if attached delegates as l_delegates then
          across l_delegates as ic loop
            Result.append ("%N delegates:")
            Result.append (ic.item.out)
            Result.append ("%N")
          end
        end 
        if attached info as l_info then
          Result.append ("%Ninfo:")
          Result.append (l_info.out)
          Result.append ("%N")    
        end  
        if attached pin as l_pin then
          Result.append ("%Npin:")
          Result.append (l_pin.out)
          Result.append ("%N")    
        end  
        if attached requestid as l_requestid then
          Result.append ("%Nrequestid:")
          Result.append (l_requestid.out)
          Result.append ("%N")    
        end  
        if attached status as l_status then
          Result.append ("%Nstatus:")
          Result.append (l_status.out)
          Result.append ("%N")    
        end  
      end
end

