import {NgModule} from "@angular/core";
import {CommonModule} from "@angular/common";
import {FormsModule} from "@angular/forms";
import {JournalBuilderComponent} from "./journal-builder/journal-builder.component";
import {JournalEditorComponent} from "./journal-editor/journal-editor.component";
import {JournalViewerComponent} from "./journal-viewer/journal-viewer.component";
import {ProfileComponent} from "./profile/profile.component";
import {JournalComponent} from "./journal/journal.component";
import {ComponentsLibraryModule} from "../components/components-library.module";
import {MyJournalsComponent} from './my-journals/my-journals.component';
import {DisciplineCreatorComponent} from './discipline-creator/discipline-creator.component';
import {AcademicPlanCreatorComponent} from './academic-plan-creator/academic-plan-creator.component';
import {MyDisciplinesComponent} from "./my-disciplines/my-disciplines.component";
import {JournalFillerComponent} from "./journal-filler/journal-filler.component";

export const DIRECTIVES = [
  JournalComponent,
  JournalBuilderComponent,
  JournalEditorComponent,
  JournalFillerComponent,
  JournalViewerComponent,
  ProfileComponent,
  MyJournalsComponent,
  DisciplineCreatorComponent,
  MyDisciplinesComponent,
  AcademicPlanCreatorComponent
];

@NgModule({
  imports: [
    CommonModule,
    FormsModule,
    ComponentsLibraryModule
  ],
  declarations: [
    ...DIRECTIVES
  ],
  exports: [
    ...DIRECTIVES
  ]
})
export class PageListModule {
}
