import { Pipe, PipeTransform } from "@angular/core";

@Pipe({
  name: "propercase"
})

export class ProperCasePipe implements PipeTransform {
  transform(value: string, reverse: boolean): string {
      if(typeof(value) == 'string') {
        let str = '';
        if(reverse == false) {
          str = value.toUpperCase();
          str = str[0].toUpperCase() + str.substring(1).toLowerCase();
        } else {
          str = value.toLowerCase();
          str = str[0].toUpperCase() + str.substring(1);
        }
        return str;
      } else {
        return value;
      }
  }
}
