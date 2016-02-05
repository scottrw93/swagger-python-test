package sw.test.cdmfm.rest;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiParam;


@Api(tags={"specific_alarm"})
@RestController
public class FaultRestController {

	public static final String cdmfmVersion = "v1";
	public static final String cdmfmRootUrl = "/cdmfm/";

	@ApiOperation(value = "uploads an image of car", notes = "", response = Void.class)
	@ApiResponses(value = { 
			@ApiResponse(code = 200, message = "successful operation")
	})
	@RequestMapping(value = "/uploadImage", 
					produces = { "application/json" }, 
					consumes = { "multipart/form-data" },
					method = RequestMethod.POST
	)
	public ResponseEntity<Void> uploadFiles(
			@ApiParam(value = "name" ) @RequestPart(value="id", required=false)  String id,
			@ApiParam(value = "file detail") @RequestPart(value="file", required=true) MultipartFile file){

		System.out.println(file.getOriginalFilename());
		System.out.println(id);

		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
	@ApiOperation(value = "uploads images of cars", notes = "", response = Void.class)
	@ApiResponses(value = { 
			@ApiResponse(code = 200, message = "successful operation")
	})
	@RequestMapping(value = "/uploadImages", 
					produces = { "application/json" }, 
					consumes = { "multipart/form-data" },
					method = RequestMethod.POST
	)
	public ResponseEntity<Void> uploadMultipleFiles(
			@ApiParam(value = "file detail") @RequestPart(value="files") List<MultipartFile> files){
		
		System.out.println(files.size());
		
        return new ResponseEntity<Void>(HttpStatus.OK);
	}


}
